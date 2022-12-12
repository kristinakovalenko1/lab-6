import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Triangle triangle1 = new Triangle(3, 3, 5);
        Triangle triangle2 = new Triangle(3, 6, 5);
        Triangle triangle3 = new Triangle(3, 3, 4);
        Triangle triangle4 = new Triangle(6, 8, 10);
        System.out.println(triangle);
        System.out.println(triangle1);
        TriangleInfo triangleInfo = new TriangleInfo();
        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add(triangle);
        triangles.add(triangle1);
        triangles.add(triangle2);
        triangles.add(triangle3);
        triangles.add(triangle4);
        triangleInfo.setTriangleList(triangles);
        System.out.println(triangleInfo);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(triangle);
        EquilateralTriangle equilateralTriangle1 = new EquilateralTriangle(triangle1);
        System.out.println(equilateralTriangle);
        System.out.println(equilateralTriangle1);


        EquilateralTriangle equilateralTriangle2 = new EquilateralTriangle(new Triangle(3, 3, 3));
        EquilateralTriangle equilateralTriangle3 = new EquilateralTriangle(new Triangle(5, 5, 5));
        EquilateralTriangle equilateralTriangle4 = new EquilateralTriangle(new Triangle(6, 6, 6));
        EquilateralTriangle equilateralTriangle5 = new EquilateralTriangle(new Triangle(9, 9, 9));
        EquilateralTriangle equilateralTriangle6 = new EquilateralTriangle(new Triangle(8, 8, 8));

        System.out.println(equilateralTriangle2);
        System.out.println(equilateralTriangle3);
        System.out.println(equilateralTriangle4);
        System.out.println(equilateralTriangle5);
        System.out.println(equilateralTriangle6);
        ArrayList<EquilateralTriangle> equilateralTriangleArrayList = new ArrayList<>();
        equilateralTriangleArrayList.add(equilateralTriangle2);
        equilateralTriangleArrayList.add(equilateralTriangle3);
        equilateralTriangleArrayList.add(equilateralTriangle4);
        equilateralTriangleArrayList.add(equilateralTriangle5);
        equilateralTriangleArrayList.add(equilateralTriangle6);
        EquilateralTriangleTest equilateralTriangleTest = new EquilateralTriangleTest();
        equilateralTriangleTest.setEquilateralTriangleList(equilateralTriangleArrayList);
        System.out.println(equilateralTriangleTest);


    }
}
