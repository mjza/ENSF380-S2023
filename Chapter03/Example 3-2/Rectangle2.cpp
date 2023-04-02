/*
* Example 3-2
*/
#include <iostream>
using namespace std;
const double INFINITY = 1.0/0.0;
bool rectangle(double x[], double y[]) {
  // Calculates each fractions
  double part1 = (x[1] - x[0]) != 0 ? (y[1] - y[0]) / (x[1] - x[0]) : INFINITY;
  double part2 = (x[2] - x[3]) != 0 ? (y[2] - y[3]) / (x[2] - x[3]) : INFINITY;
  double part3 = (x[0] - x[3]) != 0 ? (y[0] - y[3]) / (x[0] - x[3]) : INFINITY;
  double part4 = (x[1] - x[2]) != 0 ? (y[1] - y[2]) / (x[1] - x[2]) : INFINITY;
  // Compares both equations 
  bool result = (part1 == part2) && (part3 == part4);
  return result;
}

int main() 
{
 double x[4] = {0, 0, 0, 0};
 double y[4] = {0, 0, 0, 0};
 for(int i = 0; i < 4; i++) {
    cout << " X" + to_string(i+1) + ": ";
    cin >> x[i];
    cout << " Y" + to_string(i+1) + ": ";
    cin >> y[i];
 }
 // Detects the validity
  if(rectangle(x, y)) {
    cout <<"Yes, this land is a rectangle.";
  } else {
    cout <<"No, this land is not a rectangle.";
  }
  return 0;
}