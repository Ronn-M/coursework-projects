FiveDigitNumber = int(input("Input any 5-Digit Number for a Palidrome Number Result: "))

FiveDigitNumberCopy = FiveDigitNumber
PelidromeComparison = 0
while (FiveDigitNumber > 0):
        remainder = int(FiveDigitNumber)% 10
        PelidromeComparison = (PelidromeComparison * 10) + remainder
        FiveDigitNumber = FiveDigitNumber // 10    

print("\n.................................")
if PelidromeComparison == FiveDigitNumberCopy: print(PelidromeComparison,"Is a Pelindrome Number ")
elif PelidromeComparison != FiveDigitNumberCopy: print(PelidromeComparison,"Is not a Pelindrome Number")
print(".................................")
