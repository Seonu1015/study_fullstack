import './App.css';
import Timer from './Stopwatch'
import Page from './Turnpage'

function App() {
  const data = [
    {id:1, text:'Hu'},
    {id:2, text:'He'},
    {id:3, text:'Ho'},
  ] 
  const page = 1;

  return (
    <div>
      <h1>[STOPWATCH]</h1>
      <Timer/>
      <h1>[Turn The Page]</h1>
      <Page data={data} itemsPerPage={page}/>
    </div>
  );
}

export default App;
