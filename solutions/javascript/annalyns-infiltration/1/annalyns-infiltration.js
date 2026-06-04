
export function canExecuteFastAttack(knightIsAwake) {
  if  (knightIsAwake == true) {
    return false;
  }
  else{
    return true;   
  }
}
export function canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake) {
  if  (knightIsAwake == true  || archerIsAwake == true || prisonerIsAwake == true) {
    return  true;
  }
  else{
    return false;
  }
}
export function canSignalPrisoner(archerIsAwake, prisonerIsAwake) {
  return  archerIsAwake == false && prisonerIsAwake;
}
export function canFreePrisoner(
  knightIsAwake,
  archerIsAwake,
  prisonerIsAwake,
  petDogIsPresent,
) {
  if (petDogIsPresent == true) {
      return archerIsAwake == false;
    }else{
    return prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false;
  }
}
