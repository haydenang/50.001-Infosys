package com.example.problemset2;

import java.util.ArrayList;

public class GetPath {

    //Fill in your answer for this method 
    public static boolean getPath(int r, int c, ArrayList<Point> path, final int[][] grid) {
        //Check Extreme Cases
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 1) {
            return false;
        }
        //Initialise Start Point
        if (path.size()==0){
            path.add(new Point(0, 0));
        }
        //Current x and y of current recursion
        int x = path.get(path.size() - 1).x;
        int y = path.get(path.size() - 1).y;
        //If x,y corresponds to r,c, means robot reach destination.
        if (x == r && y == c) {
            return true;
        }

        //Begin movement of robot

        //If Robot move right can still move right.
        if (x + 1 < grid.length) {
            if (grid[x + 1][y] == 0 && x<r) {
                ArrayList<Point> newPath = new ArrayList<>(path);
                newPath.add(new Point(x + 1, y));
                if (getPath(r, c, newPath, grid)) {
                    path.clear();
                    path.addAll(newPath);
                    return true;
                }
            }
        }

        if (y + 1 < grid[0].length) {
            if (grid[x][y + 1] == 0 && y<c) {
                ArrayList<Point> newPath = new ArrayList<>(path);
                newPath.add(new Point(x, y + 1));
                if (getPath(r, c, newPath, grid)) {
                    path.clear();
                    path.addAll(newPath);
                    return true;

                }
            }
        }

        return false;
        /*if (r < 0 || c < 0 || r > grid.length || c > grid[0].length || grid[r][c]==1){
            return false;
        }


        // Initial starting pt
        if (path.size() == 0)
            path.add(new Point(0, 0));

        int x = path.get(path.size()-1).x;
        int y = path.get(path.size()-1).y;

        if (x == r && y == c)
            return true;

        if (y + 1 < grid[x].length) {
            if (grid[x][y + 1] != 1 && y < c) {
                ArrayList<Point> yi = new ArrayList<>(path);
                yi.add(new Point(x, y + 1));

                if (getPath(r, c, yi, grid)) {
                    path.clear();
                    path.addAll(yi);
                    return true;
                }
            }
        }

        if (x + 1 < grid.length) {
            if (grid[x + 1][y] != 1 && x < r) {
                ArrayList<Point> xi = new ArrayList<>(path);
                xi.add(new Point(x + 1, y));

                if (getPath(r, c, xi, grid)) {
                    path.clear();
                    path.addAll(xi);
                    return true;
                }
            }
        }

        return false;*/
    }

    public static void main(String[] args) {

        final int[][] grid0 = {
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0}
        };


        ArrayList<Point> path = new ArrayList<>();

        boolean success = GetPath.getPath(3, 2, path, grid0);

        System.out.println(success);
        if (success)
            System.out.println(path);
        path.clear();

    }
}

//You do not need to change any code below ---------
class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
//--------------------------------------------------

/* HINT: 
Your solution ought to work with a grid that is not square. 
Here is the grid for Test Case 8: 

            final int[][] grid = {
                    {0,0,0,1},
                    {0,1,0,0},
                    {0,1,1,1},
                    {0,0,0,1},
                    {1,1,0,0},
                    {1,1,1,0}
            };
            
If the destination is r = 5, c = 3, then getPath() returns true. 
If the destination is r = 2, c = 3, then getPath() returns false. 

*/

