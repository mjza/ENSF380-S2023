/*
* Example 3-3
*/
#include <iostream>
using namespace std;
const double INF = 1.0/0.0;
struct Point {
  double x = 0;
  double y = 0;
} points[4];
bool rectangle(Point p[]) {
  // Calculates each fractions
  double p1, p2, p3, p4;
  p1 = (p[1].x - p[0].x) != 0 ? (p[1].y - p[0].y) / (p[1].x - p[0].x) : INF;
  p2 = (p[2].x - p[3].x) != 0 ? (p[2].y - p[3].y) / (p[2].x - p[3].x) : INF;
  p3 = (p[0].x - p[3].x) != 0 ? (p[0].y - p[3].y) / (p[0].x - p[3].x) : INF;
  p4 = (p[1].x - p[2].x) != 0 ? (p[1].y - p[2].y) / (p[1].x - p[2].x) : INF;
  // Compares both equations 
  bool result = (p1 == p2) && (p3 == p4);
  return result;
}
int main() 
{
 for(int i=0; i<4; i++){
    cout << " X" + to_string(i+1) + ": ";
    cin >> points[i].x;
    cout << " Y" + to_string(i+1) + ": ";
    cin >> points[i].y;
 }
 // Detect the validity
  if(rectangle(points)) {
    cout <<"Yes, this land is a rectangle.";
  } else {
    cout <<"No, this land is not a rectangle.";
  }
  return 0;
}