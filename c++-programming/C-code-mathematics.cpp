
#include <iostream>

using namespace std;

int main()
{
    
    start: 
    
    int i;
    double value1, value2,Answer;
    
    cout << "\nMENU: " << endl;
    cout << "0 - exit" << endl;
    cout << "1 - addition" << endl;
    cout << "2 - subtraction" << endl;
    cout << "3 - multiplication" << endl;
    cout << "4 - Division" << endl;
    cout << "Your choice? :" ;
    cin >> i;
    
    switch (i)
    {
    case 0:
    cout << "0 - exit";
        goto ext;
    break;
    
    
    case 1:
    cout<<"1 - addition" << endl;
        cout << "Value 1: ";
            cin >> value1;
            
        cout << "Value 2: ";
            cin >> value2;
            
        Answer = value1 + value2; 
        
            cout << "Answer: " << Answer;
    break;
    
    case 2:
    cout<<"2 - subtraction" << endl; 
        cout << "Value 1: ";
            cin >> value1;
            
        cout << "Value 2: ";
            cin >> value2;
            
        Answer = value1 - value2;
        
            cout << "Answer: " << Answer;
    break;
    
    
    case 3:
    cout<<"3 - multiplication" << endl;   
        cout << "Value 1: ";
            cin >> value1;
            
        cout << "Value 2: ";
            cin >> value2;
            
        Answer = value1 * value2; 
        
            cout << "Answer: " << Answer;
    break;
    
    
    case 4:
    cout<<"4 - Division" << endl; 
        retry:
        cout << "Value 1: ";
            cin >> value1;
            
        cout << "Value 2: ";
            cin >> value2;
            
        Answer = value1 / value2;
        
        if (value2 == 0)
          {  cout << "Invalid Output! Try Again" << endl << endl ;
            goto retry;
          }
          
        else if (value2 != 0)
            cout << "Answer: " << Answer;
    break;

    }
    goto start;
    ext: 
    return 0;
}
