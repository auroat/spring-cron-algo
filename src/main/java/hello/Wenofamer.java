package hello;

import java.util.ArrayList;

/**
 * The class which has the Wenofame brain algorithm - the Wenofamer.
 *
 * @author Aurel Pintea
 */

public class Wenofamer {

    /**
     * This is the 0.1 version of the algorithm. It will change based on the MySQL/Spring Data types of variables.
     *
     * @param participants - lets say it's of a Long LinkedList, because each participant got his place after betting (I
     *                     will temporarily refer to the process of placing a number as "betting")
     * @param sumOfBets    - the sum of bets
     * @return - returns the ID of the winner
     */
    public static long determineWenofamer(ArrayList<Long> participants, long sumOfBets) {
        int nrOfParticipants = participants.size();
        int indexOfWinofamer = 0;
        int modulusResult;

        // If there are no bets, then return 0; keep the previous winner.
        if (participants.size() == 0) {
            return 0l;
        }

//	Case scenarios:
//	    1) The sumOfBets is lower than the nrOfParticipants = return the Wenofamer as the sumOfBets is the Xth winner;
//	    2) The sumOfBets is 0 - return the first participant = return the Wenofamer as the sumOfbets is 1;
//	    3) The sumOfBets is greater than the nrOfParticipants = return the essential Xth winner (that's the meat of the algorithm)

//	3a) The sumOfBets is greater than the nrOfParticipants
//	1a) The sumOfBets is less than nrOfParticipants
        if (sumOfBets == 0) {
            indexOfWinofamer = (int) sumOfBets;
        } else if (sumOfBets <= nrOfParticipants) {
            indexOfWinofamer = (int) --sumOfBets;
        } else if (sumOfBets > nrOfParticipants) {
            modulusResult = (int) (sumOfBets % nrOfParticipants);
            if (modulusResult > 0) {
                indexOfWinofamer = --modulusResult;
            } else {
                indexOfWinofamer = nrOfParticipants - 1;
            }
        }

        // By default, it will return the first indexed participant.
        return participants.get(indexOfWinofamer);
    }
}
