import { NativeModules } from 'react-native';
const { SumModule } = NativeModules;

export default {
  sum: (a, b, callback) => SumModule.sum(a, b, callback),
};
