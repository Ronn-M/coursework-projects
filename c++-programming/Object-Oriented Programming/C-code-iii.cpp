#include <iostream>

using namespace std;

int main(void) 
    { 
        int j,i,x;
        
            cout << "Enter the value of n: ";
                cin >> x;
                
                if (x > 30)
                    
                    cout << "Sorry, the side is too big";
                    
                else {
                
        
            cout << '+';
 
                for(i = 0; i < x; i++)
            
            cout << '-';
            cout << '+' << endl;
 
                for(i = 0; i < x; i++) 
                
                    {
  
                        cout << '|';
  
                            for(j = 0; j < x; j++)
   
                        cout << ' ';
                        cout << '|' << endl;
                    }
 
            cout << '+';
 
                for(i = 0; i < x; i++)
            
                    cout << '-';
                    cout << '+' << endl;
        
                }
        return 0;
    }