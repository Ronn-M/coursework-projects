Name = input("Please enter your name: ")

# Selection options for the Quiz.
print("\nWelcome", Name + "! Here are the available categories for the quiz:")
print("a: Mathematics")
print("b: Geography")
print("c: General Knowledge")
print("d: Exit")
Category = input("\nSelect Category to proceed: ")

# Initialization of variables to be used for loop.
index = 0

# While loop to allow multiple play options for the quiz player
while index < 6:
    try:
        # First Category Quiz Questions
        if Category.lower() == "a":
            Total_Points = 0
            print("\nYou have selected Mathematics.")
            print("Answer The Following:")

            #Question
            print("""\nQuestion 1. 106 × 106 – 94 × 94 = ?
A. 2004\tB. 2400\tC. 1904\tD. 1906""")

            #Correct answer check
            Q1A = input("Question 1 answer: ")
            if Q1A.lower() == "b":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1
            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 2. Which of the following numbers gives 240 when added to its own square?
A. 15\tB. 16\tC. 18\tD. 20""")

            Q2A = input("Question 2 answer: ")
            if Q2A.lower() == "a":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 3. In 24,673 ; the place-value of 6 is ….. .
A. 700\tB. 600\tC. 10\tD.100""")

            #Correct answer check
            Q3A = input("Question 3 answer: ")
            if Q3A.lower() == "b":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 4. The least number of two digits is ….. .
A. 99\tB. 11\tC. 90\tD. None of these""")
            
            Q4A = input("Question 4 answer: ")
            if Q4A.lower() == "b":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 5. What is 1004 divided by 2?
A. 52\tB. 502\tC. 520\tD. 5002""")

            Q5A = input("Question 5 answer: ")
            if Q5A.lower() == "b":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("\nName:", Name, "\nyour Final Score is:", Total_Points, "out of 100\n")
            Category = input("[Yes] to Exit and [No] to select another category: ")
            if Category[0].lower() == "y":
                print("Quiz ended. Thank you!")
                index += 1

            else:
                index -= index
                print("\na: Mathematics")
                print("b: Geography")
                print("c: General Knowledge")
                print("d: Exit")
                Category = input("Select Category to proceed: ")

        # Second Category Quiz Questions
        elif Category.lower() == "b":
            Total_Points = 0
            print("\nYou have selected Geography.")
            print("Answer The Following:")

            print("""\nQuestion 1. Which of the following is the largest country in the world?
A. Russia\tB. China\tC. USA\tD. South Africa""")

            Q1A = input("Question 1 answer: ")
            if Q1A.lower() == "a":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1
            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 2. Which country has the largest population in the world?
A. Russia\tB. China\tC. USA\tD. South Africa""")

            Q2A = input("Question 2 answer: ")
            if Q2A.lower() == "b":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 3. Which planet is nearest to the Earth?
A. Mercury\tB. Jupiter\tC. Venus\tD.Neptune""")

            Q3A = input("Question 3 answer: ")
            if Q3A.lower() == "c":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 4. Which is the largest waterfall in the world?
A. Victoria Falls\tB. Niagara Falls\tC. Angel Falls\tD. None of these""")

            Q4A = input("Question 4 answer: ")
            if Q4A.lower() == "a":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 5. Which river flows through the rainforest in brazil?
A. Amazon\tB. Save\tC. Nile\tD. Mississippi""")

            Q5A = input("Question 5 answer: ")
            if Q5A.lower() == "a":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("\nName:", Name, "\nyour Final Score is:", Total_Points, "out of 100\n")
            Category = input("[Yes] to Exit and [No] to select another category: ")
            if Category[0].lower() == "y":
                print("Quiz ended. Thank you!")
                index += 1

            else:
                index -= index
                print("\na: Mathematics")
                print("b: Geography")
                print("c: General Knowledge")
                print("d: Exit")
                Category = input("Select Category to proceed: ")

        # Third Category Quiz Questions
        elif Category.lower() == "c":
            Total_Points = 0
            print("\nYou have selected General Knowledge.")
            print("Answer The Following:")

            print("""\nQuestion 1. Entomology is the science that studies?
A. Behavior of human beings\tB. Insects\tC. The origin and history of technical and scientific terms\tD. The formation of rocks""")

            Q1A = input("Question 1 answer: ")
            if Q1A.lower() == "b":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1
            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 2. For which of the following disciplines is Nobel Prize awarded?
A. Physics and Chemistry\tB. Physiology or Medicine\tC. Literature, Peace and Economics\tD.	All of the above""")

            Q2A = input("Question 2 answer: ")
            if Q2A.lower() == "d":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 3. Hitler's party which came into power in 1933 is known as?
A. Labour Party\tB. Nazi Party\tC. Ku-Klux-Klan\tD. Democratic Party""")

            Q3A = input("Question 3 answer: ")
            if Q3A.lower() == "b":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 4. Exposure to sunlight helps a person improve his health because?
A. the infrared light kills bacteria in the body\tB. resistance power increases\t
C. the pigment cells in the skin get stimulated and produce a healthy tan\tD. the ultraviolet rays convert skin oil into Vitamin D""")

            Q4A = input("Question 4 answer: ")
            if Q4A.lower() == "d":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1

            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("""\nQuestion 5. Ecology deals with?
A. Birds\tB. Cell formation\tC. Relation between organisms and their environment\tD. Tissues""")

            Q5A = input("Question 5 answer: ")
            if Q5A.lower() == "c":
                Total_Points += 20
                print("Score:", Total_Points, "pts")
                index += 1
                
            else:
                print("Name:", Name, "\t", "Score:", Total_Points, "pts")
                index += 1

            print("\nName:", Name, "\nyour Final Score is:", Total_Points, "out of 100\n")
            Category = input("[Yes] to Exit and [No] to select another category: ")
            if Category[0].lower() == "y":
                print("Quiz ended. Thank you!")
                index += 1

            else:
                index -= index
                print("\na: Mathematics")
                print("b: Geography")
                print("c: General Knowledge")
                print("d: Exit")
                Category = input("Select Category to proceed: ")

        elif Category.lower() == "d":
            print("Quiz ended. Thank you!")
            index = 6

        else:
            raise Exception

    # exception for a non-existing category input
    except Exception:
        print("Invalid option! please try again.")
        index = 0
        Category = input("Select Category to proceed: ")
