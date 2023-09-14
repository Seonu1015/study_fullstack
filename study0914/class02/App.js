import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from './Home'
import Chat from './Chat'
import Video from './Video'
import Product from './Product'
import Chatting from './Chatting'

function VideoHome() {
  return (
    <>
      <p>비디오 홈</p>
    </>
  );
}

function ChatHome() {
  return (
    <>
      <p>채팅 홈</p>
    </>
  );
}

function VideoList() {
  return (
    <p>비디오 리스트 : </p>
  );
}

function ChatList() {
  return (
    <p>채팅 리스트 : </p>
  );
}

function App() {
  const productData = [
    { id: 1, name: '김밥', price: '₩2000' },
    { id: 2, name: '떡볶이', price: '₩3000' },
    { id: 3, name: '라면', price: '₩1700' },
  ];

  const chatData = [
    { id: 1, name: '김지연', text: 'Hi!' },
    { id: 2, name: '이대한', text: 'Hello!' },
    { id: 3, name: '장수진', text: 'Bye!' },
  ];

  return (
    <div>
      <Router>
        {/* 라우트 설정 */}
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/chat" element={<Chat />}>
            <Route index element={<ChatHome />} />
            <Route path="list" element={<ChatList />} />
          </Route>
          <Route path="/video" element={<Video />}>
            <Route index element={<VideoHome />} />
            <Route path="list" element={<VideoList />} />
          </Route>
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
                <Link to={`/video/product/${product.id}`}>{product.name}</Link>
              </li>
            ))}
          </ul>
        </nav>

        <nav>
          <ul>
            {chatData.map((chatting) => (
              <li key={chatting.id}>
                <Link to={`/Chat/chatting/${chatting.id}`}>{chatting.name}</Link>
              </li>
            ))}
          </ul>
        </nav>
      </Router>
    </div>
  );
}

export default App;