package Chapter10.Projects;

public class Project05 {

}
/*
Extend the ranked choice voting case study to allow for incomplete preferences.
Voters are normally allowed to fill out the ballot in an incomplete manner.
For example, with the sample ballots with four candidates, you might have ballots
that specify only a first choice or only two choices.
When you have partial information, you can end up with empty ballots because
the voter might have chosen candidates who are all eliminated.

Modify the 'Ballot' class to have an 'isEmpty' method that indicates that there are no candidates left.
(Modify the getCandidate method to return "none" in this case.)
Then modify the TallyVotes program to account for potentially empty ballots.
It is possible that the input file will contain blank lines because a voter didn’t pick any candidates,
so include a test that ignores blank lines in the input file.
Modify the code that eliminates candidates so that it removes from the list of ballots any ballots that become empty.
That way the percentages will be reported correctly on the next round of tallying.
 */