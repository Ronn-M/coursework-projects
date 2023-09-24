#include <iostream>

using namespace std;

int main()
{
    double AcountNumber;
    char UseCode,C,H,I;
    double Gallon;
    double BillCharge;
    
    // ans = 5 + (gallon * 0.0005);
    // gallon = gallon - 4000;
    // if (gallon < 0 ){
    // ans = 1000}
    // ans = 1000 + (gallon * 0.025)
    cout<<"Enter Account Number         : ";
        cin >> AcountNumber;
        
    cout<<"Enter Use Code C,H or I      : ";
        cin >> UseCode;
        
    cout<<"Enter Amount used (Gallons)  : ";
        cin >> Gallon;
        
    switch (UseCode)   
    
    {
        case 'C': // Code_C
            cout << "\n|COMMERCIAL USE|" << endl;
            
            if (Gallon > 4000)
                BillCharge = 1000 + ((Gallon - 4000) * 0.025);
                
            else
                BillCharge = 1000;
            
            cout << "\n Bill Charge      : $ " << BillCharge <<endl;
        break;
        
        
        case 'H': // Code_H
            cout << "\n|HOME USE|" << endl;
            
                BillCharge = 5 + (Gallon * 0.005);
                
            cout << "\n Bill Charge      : $ " << BillCharge << endl;
        break;
        
        
        case 'I': // Code_I
            cout << "\n|INDUSTRILAL USE|" << endl;
             
             if (Gallon >= 10000)
                BillCharge = 3000.00;
                
            else if (Gallon < 10000 && Gallon > 4000)
                BillCharge = 2000;
            
            else
                BillCharge = 1000;
                
            cout << "\n Bill Charge      : $ " << BillCharge << endl;
        break;
    }   

    return 0;
}
