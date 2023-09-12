import logo from './logo.svg';
import './App.css';
import {LoginForm} from './login';
import {Array} from './array';
// import Lottoauto from './lottoauto';
// import LottoManual from './lottomanual';
import Lotto from './lotto';

function App() {
  return (
    <div>
      <h1>Start React 200!</h1>
      <LoginForm />
      <Array />
      {/* <Lottoauto></Lottoauto>
      <LottoManual></LottoManual> */}
      <Lotto></Lotto>
    </div>
  );
}

export default App;
