Record = {}
counter = 0
while counter < 2:
    try:
        print("Menu:")
        print("[a]:Add Data")
        print("[b]:Delete Data")
        print("[c]:End")

        Menu = input("Enter your choice:")
        if Menu.lower() == "a":
            Rkey = input("Enter Key:")
            Rvalue = input("Value:")
            Record.update({Rkey:Rvalue})
            print(Record)

            reset = input("try again?yes/no:")
            if reset == "yes":
                counter -= 1
            else:
                print(Record)
                counter = 2

        elif Menu.lower() == "b":
            Rkey = input("Enter Key:")
            del Record[Rkey]
            print(Record)

            reset = input("try again?yes/no:")
            if reset == "yes":
                counter -= 1
            else:
                print(Record)
                counter = 2

        elif Menu.lower() == "c":
            print("Thank You")
            reset = input("try again?yes/no:")
            if reset == "yes":
                counter -= 1
            else:
                print(Record)
                counter = 2

        else:
           raise exception
           print("invalid Input! Please try again")
           counter -= 1
    except:
        print("invalid Data! Please try again")
        counter -= 1
