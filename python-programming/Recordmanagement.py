age = input("Age\t\t: ")
sex = input("Sex(Male/Female): ")
m_status = input("Married(Yes/No)\t: ")

if sex[:1].upper() == "F":
    print("_" * 55)
    print("Employee Sex\t\t:",sex[:1].upper())
    print("Employee Age\t\t:",age)
    print("Married(Yes/No)\t\t:",m_status[:1].upper())
    print("=" * 55)
    print("Acceptable Work Location: Urban Areas Only")

elif sex[:1].upper() == "M" and (int(age) >= 20 and int(age) <= 40):
    print("_" * 55)
    print("Employee Sex\t\t:",sex[:1].upper())
    print("Employee Age\t\t:",age)
    print("Married(Yes/No)\t\t:",m_status[:1].upper())
    print("=" * 55)
    print("Acceptable Work Location: Anywhere")

elif sex[:1].upper() == "M" and (int(age) >= 40 and int(age) <= 60):
    print("_" * 55)
    print("Employee Sex\t\t:",sex[:1].upper())
    print("Employee Age\t\t:",age)
    print("Married(Yes/No)\t\t:",m_status[:1].upper())
    print("=" * 55)
    print("Acceptable Work Location: Urban Areas Only")
    

elif int(age) < 20 or int(age) > 60:
    print("ERROR")