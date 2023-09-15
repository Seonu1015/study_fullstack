import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import BootButton from 'react-bootstrap/Button';
import { Container, Row, Col } from 'react-bootstrap';

function App() {
  return (
    <div>
      <h1>[BUTTON]</h1>
      <BootButton as="input" type="button" value="Input" />
      <Container>
        <Row>
          <Col>
            <h1>Hello World!</h1>
            <BootButton variant='default'>버튼</BootButton>
            <BootButton variant='primary'>버튼</BootButton>
            <BootButton variant='success'>버튼</BootButton>
            <BootButton variant='info'>버튼</BootButton>
            <BootButton variant='warning'>버튼</BootButton>
            <BootButton variant='danger'>버튼</BootButton>
            <BootButton variant='link'>버튼</BootButton>
          </Col>
        </Row>
      </Container>
    </div>
  );
}

export default App;
