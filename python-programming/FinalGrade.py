
print ("Input the following requested grades below\n")

Assignment = int(input("Assignment Grade(%): "))
Attendance = int(input("Attendance Grade(%): "))
ShortQuiz  = int(input("ShortQuiz Grade(%) : "))
Project    = int(input("Project Grade(%)   : "))
LongQuiz   = int(input("LongQuiz Grade(%)  : "))
MajorExam  = int(input("MajorExam Grade(%) : "))

# 10% of Assignment
AssignmentPercentage = (Assignment/100) * 10

# 10% of Attendance
AttendancePercentage = (Attendance/100) * 10

# 15% of ShortQuiz
ShortQuizPercentage = (ShortQuiz/100) * 15

# 15% of Project
ProjectPercentage = (Project/100) * 15

# 20% of LongQuiz
LongQuizPercentage = (LongQuiz/100) * 20

# 30% of MajorExam
MajorExamPercentage = (MajorExam/100) * 30

FinalGrade = AssignmentPercentage + AttendancePercentage + ShortQuizPercentage + ProjectPercentage + LongQuizPercentage + MajorExamPercentage

print ("\n........................")
print ("Final Grade is:",FinalGrade)

#Grade Remarks 90-100 (Very Good)
if FinalGrade > 89: print("Very Good")

#Grade Remarks 80-89 (Good)
elif FinalGrade > 79  and FinalGrade < 90: print("Good")

#Grade Remarks 70-79 (Fair)
elif FinalGrade > 69 and FinalGrade < 80: print("Fair")
    
#Grade Remarks 60-69 (Poor)
elif FinalGrade > 59 and FinalGrade < 70: print("Poor")

#Grade Remarks below 60 (Need Improvements)
elif FinalGrade < 60: print("Need Improvements")






