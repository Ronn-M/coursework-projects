from random import randint

number = 0
Number_File = open("Numbers.txt", 'w')
print("Creating file with random numbers in the external file: Numbers.txt")

print("\nInputing data...\n")

for num in range(0,10):  
    number = randint(50,101)
    Number_File.write(str(number))
    Number_File.write("\n")
Number_File.close()

print("Your Data has been saved in file: Numbers.txt")

print("\nReading file: ")
NumList = []

file = open("Numbers.txt","r")
for line in file:
    line = line.strip()
    NumList.append(int(line))
    print(line)
file.close()

Total = 0
for count in range(10):
    Total += NumList[count]
    
print("\nThe Total sum of the numbers is:",Total)
