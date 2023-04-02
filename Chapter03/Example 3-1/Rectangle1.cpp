/*
* Example 3-1
*/
#include <iostream>
using namespace std;
const double INFINITY = 1.0/0.0;
bool rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
	// Calculates each fractions
	double part1 = (x2 - x1) != 0 ? (y2 - y1) / (x2 - x1) : INFINITY;
	double part2 = (x3 - x4) != 0 ? (y3 - y4) / (x3 - x4) : INFINITY;
	double part3 = (x1 - x4) != 0 ? (y1 - y4) / (x1 - x4) : INFINITY;
	double part4 = (x2 - x3) != 0 ? (y2 - y3) / (x2 - x3) : INFINITY;
	// Compares both equations 
	bool result = (part1 == part2) && (part3 == part4);
	return result;
}
int main() 
{
    double x1, y1, x2, y2, x3, y3, x4, y4;
    cout << " X1: "; cin >> x1;
    cout << " Y1: "; cin >> y1;
    cout << " X2: "; cin >> x2;
    cout << " Y2: "; cin >> y2;
    cout << " X3: "; cin >> x3;
    cout << " Y3: "; cin >> y3;
    cout << " X4: "; cin >> x4;
    cout << " Y4: "; cin >> y4;
    // Detects the validity
    if(rectangle(x1, y1, x2, y2, x3, y3, x4, y4))
        cout <<"Yes, this land is a rectangle.";
    else
        cout <<"No, this land is not a rectangle.";
    return 0;
}