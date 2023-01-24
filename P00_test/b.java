package P00_test;

public class b {
    public static void main(String[] args) {
        int[][] office = {{5, -1, 4}, {6, 3, -1}, {2, -1, 1}};
        int r = 1;
        int c = 0;
        String[] move = {"go", "go", "right", "go", "right", "go", "left", "go"};

        System.out.println(solution(office, r, c, move));
    }

    public static int solution(int[][] office, int r, int c, String[] move) {
        int answer = office[r][c];
        office[r][c] = 0;

        int position = 0;
        for(int i=0; i<move.length; i++) {
            if(move[i].equals("go")) {
                if(position == 0) {
                    if(r == 0 || office[r-1][c] == -1) continue;
                    r--;
                } else if(position == 1) {
                    if(c == office.length-1 || office[r][c+1] == -1) continue;
                    c++;
                } else if(position == 2) {
                    if(r == office.length-1 || office[r+1][c] == -1) continue;
                    r++;
                } else {
                    if(c == 0 || office[r][c-1] == -1) continue;
                    c--;
                }
                answer += office[r][c];
                office[r][c] = 0;
            } else if(move[i].equals("left")) {
                position -= 1;
                if(position < 0) position = 3;
            } else {
                position += 1;
                if(position > 3) position = 0;
            }
        }
        return answer;
    }
}
