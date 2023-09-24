#include <iostream>

using namespace std;

int main()
{
    double n, i, nv = 1;
    
        cout << "Enter an n value: ";
            cin >> n;
            
        for (i = 1; i <= n; i ++)
            nv *= i;
        cout << nv;

    return 0;
}
