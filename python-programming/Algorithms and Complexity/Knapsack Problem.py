"""
    Dynamic Programming
    Exercise 1: Knapsack Problem

    Instructions:
    Write a python program that will solve the Knapsack problem using the ff. given:
    W = { 3, 4, 5, 6 }   V = { 20, 8, 10, 25 }    max W = 8
    W = { 1, 2, 5, 6 }   V = { 2, 3, 4, 5 }       max W = 8
    W = { 1, 2, 3, 5 }   V = { 30, 70, 50, 60 }   max W = 5

    *** Display also the table.
    Note: Submit the .py file and a pdf file containing the screenshots of the outputs.
"""
########################################################################################################################
import numpy as np      # in ide terminal install using command pip install numpy
import pandas as pd     # in ide terminal install using command pip install pandas

#**********************************************************************************************************************#

# function to add the table's maximum weight as the columns
def add_weight(table, max_weight):

    # loop to add zeros to the newly created columns
    for indx in range(1, max_weight + 1):
        table[indx] = 0
#**********************************************************************************************************************#

# function for calculating  possible weight combinations or weights less than our maximum weight.
def ks_values(table, weights, values, max_weight):

    # loop to iterate tables
    for t in range(1, 4):
        weightCombinations = [] # list to add combinations of the all the total calculated weights.

        # loop to iterate the available weights in table using the weights array
        for i in range(1, 5):

            # loop to add total weight and total best weight combinations to the table
            for m in range(0, max_weight):

                # checking condition to see if current weight (i) from weight lists is table (W) column
                if table.iloc[i, m] != weights[i]:
                    pass

                # when checked condition is true
                else:
                    CombValue = values[i] + values[i - 1] # # default value combination
                    CombWeight = weights[i] + weights[i - 1] # default weight combination

                    # condition check for identifying if adding weights (i & i - 1 )is greater than max_weight
                    if (weights[i] + weights[i - 1]) > max_weight:
                        pass

                    # condition check for identifying if adding weights (i & i - 1)is less than or equal to max_weight
                    elif (weights[i] + weights[i - 1]) <= max_weight:

                        # condition check for identifying if adding weights (i & i - 1 & i - 2) is ->
                        # less than or equal to max_weight
                        if (weights[i] + weights[i - 1] + weights[i - 2]) <= max_weight and (i - 2) >= 0:
                            CombValue = values[i] + values[i - 1] + values[i - 2] # new value combination
                            CombWeight = weights[i] + weights[i - 1] + weights[i - 2] # new weight combination

                            # add weight combination to weightCombinations list
                            weightCombinations.append([(weights[i], weights[i - 1], weights[i - 2]), CombValue])

                            table.loc[i, weights[i]] = values[i] # add weight value to table
                            table.loc[i, CombWeight] = CombValue # add weight combination value to table


                        else:

                            # add weight combination to weightCombinations list
                            weightCombinations.append([(weights[i], weights[i - 1]), CombValue])

                            table.loc[i, weights[i]] = values[i] # new  value
                            table.loc[i, CombWeight] = CombValue # add weight combination value to table

                # add weight to weightCombinations list
                weightCombinations.append([(weights[i]), values[i]])

                table.loc[i, weights[i]] = values[i] # add weight value to table

                # condition check for identifying if adding weights (i & i - 2) is less than or equal to max_weight
                if (weights[i] + weights[i - 2]) <= max_weight and (i - 2) >= 0:
                    CombValue = values[i] + values[i - 2] # new value
                    CombWeight = weights[i] + weights[i - 2] # new weight combination

                    # add weight combination to weightCombinations list
                    weightCombinations.append([(weights[i], weights[i - 2]), CombValue])

                    table.loc[i, weights[i]] = values[i] # add weight value to table
                    table.loc[i, CombWeight] = CombValue # add weight combination value to table

    # output weightCombinations list
    return weightCombinations
#**********************************************************************************************************************#
# function to determine the most profitable set of weights and output the result
def mx(list):
    CWL = []
    FL = []

    # loop to iterate the weightCombinations list
    for index in CWL_log:

        # condition statement to add items in weightCombinations list and filter out repeating items to a new list CWL
        if index not in CWL:
            CWL.append(index)

    Mx = 0 # initialize Mx variable to zero

    # loop to iterate item in CWL list
    for count in CWL:

        # loop to iterate indexes of the list CWL
        for cnt in range(len(CWL) - 1):

            # condition statement to check if count[last index] is less than Variable Mx
            if count[len(count) - 1] < Mx: # count last index holds total value of weight combinations store in CWL list
                pass

            # if the if condition is false, new Mx value is = count[last index]
            else:
                Mx = count[len(count) - 1]
                final = str(count) # replace variable final with the weight combinations/weight with the greater value

    FL.append('Most profitable weight/s - ' + str(final)) # append final to an empty list

    return FL # return the list with the weight combinations with the greater value
#**********************************************************************************************************************#

# 2 dimention arrays with list of weights in index 0 and values in index 1
T1_WV = np.array([[0, 3, 4, 5, 6], [0, 20, 8, 10, 25]], dtype=object)
T2_WV = np.array([[0, 1, 2, 5, 6], [0, 2, 3, 4, 5]], dtype=object)
T3_WV = np.array([[0, 1, 2, 3, 5], [0, 30, 70, 50, 60]], dtype=object)

# maximum capacity of each knapsack
T1_maxW = 8
T2_maxW = 8
T3_maxW = 5

########################################################################################################################
#### NB * the function globals() convert string to a readable variable
# loop to iterate tables
for tab in range(1, 4):
    max_weight = globals()[f"T{tab}_maxW"] # assigning max weight of table number in variable tab
    weights = globals()[f"T{tab}_WV"][0] # assigning weights of table number in variable tab
    values = globals()[f"T{tab}_WV"][1] # assigning values of table number in variable tab

    # creating a table using weight list and assigning these weight to the column W
    globals()[f"TABLE_{tab}"] = pd.DataFrame(weights, columns=["W"])
    table = globals()[f"TABLE_{tab}"] # assigning the table name to a variable table

    add_weight(table, max_weight) # using the function add_weight

    CWL_log = ks_values(table, weights, values, max_weight) # using the function ks_values
    Max = mx(CWL_log) # using the function mx

    print(f"\nTable_{tab}") # printing table name
    print(f"Weights  : {weights}\n" + f"Values   : {values}", "\n") # printing weights and values lists
    print(table, "\n")
    print(f"Table_{tab}: {Max[0]} \n") # printing the variable Max

########################################################################################################################


