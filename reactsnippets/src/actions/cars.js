export const ADD_CARS = 'ADD_CARS';
export const REMOVE_CARS = 'REMOVE_CARS';
export const UPDATE_CARS = 'UPDATE_CARS';

export function addCars(cars) {
  return {
    type: 'ADD_CARS',
    payload: cars
  };
}
export function removeCars(cars) {
  return {
    type: 'REMOVE_CARS',
    payload: cars
  };
}
export function updateCars(cars) {
  return {
    type: 'UPDATE_CARS',
    payload: cars
  };
}
