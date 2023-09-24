Winter = (90,100,98)
Summer = (74,89,85)
Spring = (75,96,88)
Paul = (100,100,100)

name_scr = []
win_avg = 0
sum_avg = 0
spr_avg = 0
pau_avg = 0

name_scr = Winter
for counter in range(len(name_scr)):
    win_avg += int(name_scr[counter])
    continue
win_avg /= len(name_scr)

name_scr = Summer
for counter in range(len(name_scr)):
    sum_avg += int(name_scr[counter])
    continue
sum_avg /= len(name_scr)

name_scr = Spring
for counter in range(len(name_scr)):
    spr_avg += int(name_scr[counter])
    continue
spr_avg /= len(name_scr)

name_scr = Paul
for counter in range(len(name_scr)):
    pau_avg += int(name_scr[counter])
    continue
pau_avg /= len(name_scr)

print("Winter:", format(win_avg,'.2f'), "\nSummer:", format(sum_avg,'.2f'), "\nSpring:", format(spr_avg,'.2f'), "\nPaul:", format(pau_avg,'.2f'))

if Winter.count(100) >= 1:
    Occ_Win = Winter.count(100)
    print("Winter got", Occ_Win, 100)
else:
    print("Winter score is", Winter)

if Summer.count(100) >= 1:
    Occ_Sum = Summer.count(100)
    print("Summer got", Occ_Sum, 100)
else:
    print("Summer score is", Summer)

if Spring.count(100) >= 1:
    Occ_Spr = Spring.count(100)
    print("Spring got", Occ_Spr, 100)
else:
    print("Spring score is", Spring)

if Paul.count(100) >= 1:
    Occ_Pau = Paul.count(100)
    print("Paul got", Occ_Pau, 100)
else:
    print("Paul score is", Winter)

if max(Winter, Summer, Spring, Paul) == Winter:
    print("Winter got the highest Score!")

elif  max(Winter, Summer, Spring, Paul) == Summer:
    print("Summer got the highest Score!")

elif max(Winter, Summer, Spring, Paul) == Spring:
    print("Spring got the highest Score!")

else:
    print("Paul got the highest Score!")

if min(Winter, Summer, Spring, Paul) == Winter:
    print("Winter got the lowest Score!")

elif  min(Winter, Summer, Spring, Paul) == Summer:
    print("Summer got the lowest Score!")

elif min(Winter, Summer, Spring, Paul) == Spring:
    print("Spring got the lowest Score!")

else:
    print("Paul got the lowest Score!!")

