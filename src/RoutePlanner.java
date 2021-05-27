import java.util.*;

public class RoutePlanner {

    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {
    	if (mapMatrix == null) {
            return false;
        }

        // Check method parameters for destination.
        if (toRow >= mapMatrix.length) {
            return false;
        }
        if (toColumn >= mapMatrix[toRow].length) {
            return false;
        }

        // Check that destination is reachable.
        if (!mapMatrix[toRow][toColumn]) {
            return false;
        }

        // Check remaining method parameters.
        if (fromRow >= mapMatrix.length) {
            return false;
        }
        if (fromColumn >= mapMatrix[fromRow].length) {
            return false;
        }

        if (!mapMatrix[fromRow][fromColumn]) {
            return false;
        }
        if (fromRow == toRow  &&  fromColumn == toColumn) {
            return true;
        }
        boolean exists = routeExists(fromRow + 1, fromColumn, toRow, toColumn, mapMatrix);
        if (!exists) {
            exists = routeExists(fromRow, fromColumn + 1, toRow, toColumn, mapMatrix);
        }
        return exists;
    }
        
    public static void main(String[] args) {
        boolean[][] mapMatrix = {
            {true,  false, false},
            {true,  true,  false},
            {false, true,  true}
        };
        
        System.out.println(routeExists(0, 0, 2, 2, mapMatrix));
    }
}