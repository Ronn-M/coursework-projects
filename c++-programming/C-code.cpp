/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int cO, cOx, count;
    
    cout << "Enter Number: ";
        cin >> cO;
        
         
    count = 0;
    
        do
        
            {
                cOx = cO % 2;
                
                
                if (cOx != 1)
                
                    {
                    cO /= 2;
                    }
                    
                else
                
                    {
                    cO = (3 * cO) + 1;
                    }
                    
            cout << cO << endl;
            count ++;
            }
            
        while(cO > 1);
        
        cout << "steps = " << count;
        
    return 0;
}
