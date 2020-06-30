import java.util.*;

public class CubeRunner {

	public static void main(String[] args) {
		NumberCube theCube = new NumberCube();

        int[] theTosses = NumberCube.getCubeTosses(theCube, 25);
        System.out.println(Arrays.toString(theTosses));

        System.out.println();

        int longest = NumberCube.getLongestRun(theTosses);

        if (longest == -1)
            System.out.println("There is no run in the array.");
        else
            System.out.println("The longest run is " + longest + ".");

	}

}
