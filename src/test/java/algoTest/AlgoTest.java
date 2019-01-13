package algoTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import hello.Wenofamer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class AlgoTest {

    ArrayList<Long> participants;
    long sumOfBets;
    long wenofamer;

    @Test
    public void testDetermineWenofamer() {

	// Test in case the number of participants is greater than 1.
	participants = new ArrayList<>(Arrays.asList(3l, 7l, 2l));

	sumOfBets = 0;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(3l));

	sumOfBets = 1;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(3l));

	sumOfBets = 2;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(7l));

	sumOfBets = 3;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(2l));

	sumOfBets = 5;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(7l));

	sumOfBets = 6;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(2l));

	sumOfBets = 7;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(3l));

	sumOfBets = 11;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(7l));

	// Test in case the number of participants is 1.
	participants = new ArrayList<>(Arrays.asList(2l));

	sumOfBets = 11;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(2l));

	sumOfBets = 0;
	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
	assertThat(wenofamer, is(notNullValue()));
	assertThat(wenofamer, equalTo(2l));

	// How about a test for the nrOfParticipants = 0?
	// Maybe not needed - this my never happen
	// The logic for the
//	participants = new ArrayList<>();
//
//	sumOfBets = 11;
//	wenofamer = Wenofamer.determineWenofamer(participants, sumOfBets);
//	assertThat(wenofamer, is(notNullValue()));
//	assertThat(wenofamer, equalTo(2l));
    }
}
