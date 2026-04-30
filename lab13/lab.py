import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
#gets the data from the csv file
df = pd.read_csv('startup_traffic.csv')

df['Visitors'] = df ['Visitors'].interpolate()

# 1. Set Date as the index (required for resampling)
df_time = df.set_index('Date')
# Change 'M' to 'ME'
monthly_totals = df_time['Visitors'].resample('ME').sum()

# Plotting
monthly_totals.plot(kind='bar', color='darkblue')
plt.show()
# 2. Resample to Monthly ('M') and sum the Visitors
monthly_totals = df_time['Visitors'].resample('M').sum()

print("Monthly Visitor Totals:")
print(monthly_totals)

# 3. Plot the Monthly Bar Chart for the Board
plt.figure(figsize=(10, 6))
monthly_totals.plot(kind='bar', color='darkblue', edgecolor='black')

# Clean up the X-axis labels to show Month-Year
plt.title('Total Monthly Visitors (Board of Directors View)', fontsize=14)
plt.ylabel('Total Visitors')
plt.xlabel('Month')
plt.xticks(rotation=45)
plt.grid(axis='y', linestyle='--', alpha=0.7)

plt.tight_layout()
plt.show()
