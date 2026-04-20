import pandas as pd

#gets the data from the csv file
df = pd.read_csv('dirty_sales-1.csv')

df= df.sort_values(by='Date')

#gets rid of missing or unformatted in the price column
df['Price'] = df['Price'].str.replace('$', '', regex=False).str.replace(',', '', regex=False).astype(float)
df['Price'] = df['Price'].fillna(df['Price'].mean())


#removes excess rows
df_clean = df.drop_duplicates()

df_clean['Total Cost'] = df_clean['Price'] * df_clean['Quantity']

#Calculate total revenue for each Category
category_performance = df_clean.groupby('Category')['Total Cost'].sum()

#Identify the top performer
top_performer = category_performance.idxmax()
top_revenue = category_performance.max()

#Identify the struggling category
struggling_category = category_performance.idxmin()
bottom_revenue = category_performance.min()

#Print the category info
print(category_performance)
print(f"Top Performer: {top_performer} (${top_revenue})")
print(f"Struggling Category: {struggling_category} (${bottom_revenue})")


#Calculate total revenue for each Customer
customers= df_clean.groupby('CustomerName')['Total Cost'].sum()

#Identify the top customer 
top_purchaser= customers.idxmax()
top_buy= customers.max()


print(f"Top Customer: {top_purchaser} (${top_buy})")

total_revenue = df_clean['Total Cost'].sum()

print('The total revenue of the company is: $' , total_revenue)

#prints out some of the data to check
print(df_clean.head(40))

df_clean.info();
