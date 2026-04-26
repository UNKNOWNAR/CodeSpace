public class RubicksCube {
    public char[][][] cube;

    public RubicksCube() {
        cube = new char[6][3][3];
        initializeCubeColors();
    }

    private void initializeCubeColors() {
        // Initialize each face of the cube with its color
        // Use characters to represent colors (e.g., 'R' for Red, 'G' for Green, etc.)
        for (int face = 0; face < 6; face++) {
            char color;
            switch (face) {
                case 0:
                    color = 'R'; // Red
                    break;
                case 1:
                    color = 'G'; // Green
                    break;
                case 2:
                    color = 'O'; // Orange
                    break;
                case 3:
                    color = 'B'; // Blue
                    break;
                case 4:
                    color = 'Y'; // Yellow
                    break;
                case 5:
                    color = 'W'; // White
                    break;
                default:
                    color = ' '; // Default to a space for other faces (invalid)
                    break;
            }
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    cube[face][row][col] = color;
                }
            }
        }
    }
}