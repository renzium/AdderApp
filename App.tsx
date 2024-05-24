// App.js
import React from 'react';
import {Button, View, Text} from 'react-native';
import {NativeModules} from 'react-native';

const {AdderModule} = NativeModules;

const App = () => {
  const [result, setResult] = React.useState(null);

  const addNumbers = async () => {
    try {
      const res = await AdderModule.addNumbers(10, 5);
      setResult(res);
    } catch (e) {
      console.error(e);
    }
  };

  return (
    <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
      <Button title="Add Numbers" onPress={addNumbers} />
      {result !== null && <Text>Result: {result}</Text>}
    </View>
  );
};

export default App;
