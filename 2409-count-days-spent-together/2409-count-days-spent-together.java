class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(
            day(arriveAlice), day(arriveBob));

        int end = Math.min(
            day(leaveAlice), day(leaveBob));

        return Math.max(0, end - start + 1);
    }

    int day(String date) {
        String[] d = date.split("-");
        int month = Integer.parseInt(d[0]);
        int day = Integer.parseInt(d[1]);

        int[] days = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }
}
    