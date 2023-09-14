import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from './Home'
import Chat from './Chat'
import Video from './Video'
import Product from './Product'

function App() {
  const productData = [
    {id: 1, name:'김밥' , price:'₩2000'},
    {id: 2, name:'떡볶이' , price:'₩3000'},
    {id: 3, name:'라면' , price:'₩1700'},
  ];

  return (
    <div>
      <Router>
        {/* 라우트 설정 */}
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/chat" element={<Chat />} />
          <Route path="/video" element={<Video />} />
          <Route path="/product/:id" element={<Product data={productData}/>} />
        </Routes>

        <nav>
          <ul>
            <li>
              <Link to='/'>홈</Link>
            </li>
            <li>
              <Link to='/chat'>채팅</Link>
            </li>
            <li>
              <Link to='/video'>비디오</Link>
            </li>
          </ul>
        </nav>

        <nav>
          <ul>
            {productData.map((product) => (
              <li key={product.id}>
                <Link to={`/product/${product.id}`}>{product.name}</Link>
              </li>
            ))}
          </ul>
        </nav>
      </Router>
    </div>
  );
}

export default App;