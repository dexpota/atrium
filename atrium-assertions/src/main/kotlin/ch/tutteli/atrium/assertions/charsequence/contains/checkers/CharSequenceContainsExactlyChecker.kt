package ch.tutteli.atrium.assertions.charsequence.contains.checkers

import ch.tutteli.atrium.assertions.DescriptionCharSequenceAssertion
import ch.tutteli.atrium.assertions.IAssertion

/**
 * Represents a check that an expected object is contained exactly [times] in the search input.
 *
 * @param times The number which the check uses to compare against the actual number of times an expected object is
 *              found in the input stream.
 * @param nameContainsNotFun The function which should be used instead of [nameExactlyFun] when [times] equals to zero.
 * @param nameExactlyFun The function which was used and should not be used if [times] equals to zero.
 * @throws IllegalArgumentException In case [times] is smaller than 1.
 */
class CharSequenceContainsExactlyChecker(
    times: Int,
    nameContainsNotFun: String,
    nameExactlyFun: String
) : CharSequenceContainsChecker(times, nameContainsNotFun, nameExactlyFun) {

    override fun createAssertion(foundNumberOfTimes: Int): IAssertion
        = createBasicAssertion(DescriptionCharSequenceAssertion.EXACTLY, foundNumberOfTimes == times)
}
