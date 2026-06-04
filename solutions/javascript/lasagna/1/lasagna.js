export const EXPECTED_MINUTES_IN_OVEN = 40; 
const PREPARATION_MINUTES_PER_LAYER = 2;

/**
 * Determines the number of minutes the lasagna still needs to remain in the
 * oven to be properly prepared.
 *
 * @param {number} actualMinutesInOven
 * @returns {number} the number of minutes remaining
 */
export function remainingMinutesInOven(actualMinutesInOven) {
  if  (actualMinutesInOven <= 40) {
    return 40 - actualMinutesInOven;
  }
}

export function preparationTimeInMinutes(numberOfLayers) {
  return  numberOfLayers * 2;
}
export function totalTimeInMinutes(numberOfLayers, actualMinutesInOven) {
  return  (numberOfLayers* 2) + actualMinutesInOven;
}
