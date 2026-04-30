import pandas as pd
import matplotlib.pyplot as plt
import numpy as np


df = pd.read_csv('nexus_stream_data.csv')
df['Subscription_Type'] = df['Subscription_Type'].str.capitalize()
df = df.sort_values('Watch_Time_Hours',ascending=False)
df = df[df['Watch_Time_Hours'] <=24]
print(df.head(20))

#The bar chart for device data
# device_revenue = df.groupby('Device')['Monthly_Revenue'].sum().sort_values(ascending=False)
#
# print("Revenue by Device:")
# print(device_revenue)
#
# import matplotlib.pyplot as plt
# device_revenue.plot(kind='bar', color=['#1f77b4', '#ff7f0e', '#2ca02c'])
# plt.title('Most Profitable Device for Nexus Stream')
# plt.ylabel('Total Revenue ($)')
# plt.xticks(rotation=0)
# plt.show()

#The historgram for watch hours
# plt.figure(figsize=(10, 6))
# plt.hist(df['Watch_Time_Hours'], bins=20, color='teal', edgecolor='black', alpha=0.7)
#
# # 2. Add "Standard Experience" indicators (Mean and Median)
# plt.axvline(df['Watch_Time_Hours'].mean(), color='red', linestyle='--', label=f"Mean: {df['Watch_Time_Hours'].mean():.2f}h")
# plt.axvline(df['Watch_Time_Hours'].median(), color='yellow', linestyle='-', label=f"Median: {df['Watch_Time_Hours'].median():.2f}h")
#
# # 3. Titles and Labels
# plt.title('The Engagement Map: Distribution of Watch Time')
# plt.xlabel('Watch Time (Hours)')
# plt.ylabel('Number of Users')
# plt.legend()
# plt.grid(axis='y', alpha=0.3)
# plt.show()

#The code for correlation data
# engagement_correlation = df['Watch_Time_Hours'].corr(df['Support_Tickets'])
#
# print(f"Correlation between Watch Time and Support Tickets: {engagement_correlation:.4f}")
# # 1. Create the Scatter Plot
# plt.figure(figsize=(10, 6))
# plt.scatter(df['Watch_Time_Hours'], df['Support_Tickets'], alpha=0.6, color='darkorange', edgecolors='w', s=80)
#
# # 2. Add a Trend Line (Linear Regression)
# # This helps the Board see the "direction" of the relationship
# m, b = np.polyfit(df['Watch_Time_Hours'], df['Support_Tickets'], 1)
# plt.plot(df['Watch_Time_Hours'], m * df['Watch_Time_Hours'] + b, color='black', linestyle='--', linewidth=2, label='Trend Line')
#
# # 3. Add Labels and Formatting
# plt.title('Relationship: Watch Time vs. Support Tickets', fontsize=14)
# plt.xlabel('Watch Time (Hours)', fontsize=12)
# plt.ylabel('Number of Support Tickets', fontsize=12)
# plt.legend()
# plt.grid(True, linestyle=':', alpha=0.7)
#
# plt.show()


df['Timestamp'] = pd.to_datetime(df['Timestamp'])
df = df.sort_values('Timestamp')

daily_rev = df.groupby('Timestamp')['Monthly_Revenue'].sum().reset_index()

daily_rev['7_Day_Avg'] = daily_rev['Monthly_Revenue'].rolling(window=7).mean()

plt.figure(figsize=(10, 5))
plt.plot(daily_rev['Timestamp'], daily_rev['Monthly_Revenue'], alpha=0.3, label='Daily Actual')
plt.plot(daily_rev['Timestamp'], daily_rev['7_Day_Avg'], color='red', label='7-Day Rolling Avg')
plt.legend()
plt.title('Daily Revenue with 7-Day Smoothing')
plt.show()

monthly_rev = daily_rev.set_index('Timestamp')['Monthly_Revenue'].resample('ME').sum().reset_index()
monthly_rev['Month_Index'] = np.arange(len(monthly_rev))

# Step B: Calculate the Trend (Linear Regression)
m, b = np.polyfit(monthly_rev['Month_Index'], monthly_rev['Monthly_Revenue'], 1)

# Step C: Forecast 6 months into the future
current_last_month = monthly_rev['Month_Index'].max()
target_month_index = current_last_month + 6
prediction = m * target_month_index + b

print(f"Current Monthly Revenue Trend: ${monthly_rev['Monthly_Revenue'].iloc[-1]:,.2f}")
print(f"Predicted Total Monthly Revenue in 6 months: ${prediction:,.2f}")
