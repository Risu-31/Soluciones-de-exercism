
export function dayRate(ratePerHour) {
  return ratePerHour * 8;
}
export function daysInBudget(budget, ratePerHour) {
  return Math.floor(budget / (ratePerHour * 8));
}

export function priceWithMonthlyDiscount(ratePerHour, numDays, discount) {
  let mes = Math.floor(numDays / 22);
  let diario = ratePerHour * 8;
  let descuento = (mes * 22 * diario) * (1 - discount);
  let sobrante = (numDays % 22) * diario;
  return Math.ceil( descuento + sobrante);
}
