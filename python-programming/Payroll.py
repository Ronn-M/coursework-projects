print("===============================================")
print("Welcomme to the Laging Lugi *PAYROLL SYSTEM*")
print("===============================================\n")

EmployeeName = input("Input Employee Full Name: ")
Daysworked   = input("Input Days Worked: ")
RatePerDay   = 285.00
GrossPay     = float(RatePerDay) * float(Daysworked)
Wtax         = float(GrossPay) * 0.1
Netpay       = GrossPay - Wtax

print(str("\n"+ EmployeeName) + "'s Total Rate at 285.00 php is: ")
print("...............................................")
print("\nGross Pay          : ₱",GrossPay)
print("Deduction Tax(10%) : ₱",Wtax)
print("===============================================")
print("Net Pay            : ₱",Netpay)
print("===============================================")

