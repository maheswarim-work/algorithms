import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        int biggestGap = binaryGap.solution(529);
        System.out.println("Biggest gap = " + biggestGap);
    }

    @Test
    public void testSolution() {
        assertEquals(2, new BinaryGap().solution(529));
    }

    public int solution(int N) {

        int first1Index = 0;
        int currentGap = 0;
        int biggestGap = 0;

        for(int i=0; i<32; i++) {
            if(getNthBit(N, i) == 1) {
                first1Index = i;
                break;
            }
        }

        for(int i=first1Index; i<32; i++) {
            if(getNthBit(N, i) == 0) {
                currentGap++;
            } else {
                if(currentGap > biggestGap) {
                    biggestGap = currentGap;
                }
                currentGap = 0;
            }
        }

        return biggestGap;

    }

    private int getNthBit(int theNumber, int bitPosition) {

        int mask = 1;
        final int theNumberShifted = theNumber >> bitPosition;
        return theNumberShifted & mask;

    }

}
