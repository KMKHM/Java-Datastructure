//package Lesson04;
//
//public class OrthoLine {
//    // 양 끝점
//    public MyPoint2 u;
//    public MyPoint2 v;
//
//    public OrthoLine(MyPoint2 p, MyPoint2 q) {
//        u = p;
//        v = q;
//    }
//
//    public OrthoLine(int x1, int y1, int x2, int y2) {
//        u = new MyPoint2(x1, y1);
//        v = new MyPoint2(x2, y2);
//    }
//
//    public boolean isVertical() { // 수직인지: 양 끝점의 x가 같으면 수직이다.
//        return (u.x == v.x);
//    }
//
//    public boolean intersects(OrthoLine other) {
//        if (isVertical() && !other.isVertical()) {
//
//        } else if (!isVertical() && other.isVertical()) {
//
//        } else {
//            return false;
//        }
//    }
//}
