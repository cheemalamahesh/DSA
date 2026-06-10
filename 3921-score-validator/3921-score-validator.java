class Solution {
    public int[] scoreValidator(String[] events) {
        int tol = 0;
        int cnt = 0;
        String n = "123456";

        for (String c : events) {
            if (n.indexOf(c) != -1) {
                switch (c) {
                    case "1":
                        tol += 1;
                        break;
                    case "2":
                        tol += 2;
                        break;
                    case "3":
                        tol += 3;
                        break;
                    case "4":
                        tol += 4;
                        break;
                    case "5":
                        tol += 5;
                        break;
                    case "6":
                        tol += 6;
                        break;
                }
            } else if (c.equals("W")) {
                cnt++;
                if (cnt == 10) {
                    return new int[]{tol, cnt};
                }
            } else if (c.equals("WD")) {
                tol++;
            } else if (c.equals("NB")) {
                tol++;
            }
        }

        return new int[]{tol, cnt};
    }
}