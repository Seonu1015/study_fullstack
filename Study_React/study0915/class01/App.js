import './App.css';
import Button from "./Button";
import styled from "styled-components";
import {css} from '@emotion/react';
import emotion from '@emotion/styled'

const EmotionButton = css`
  background-color:aqua;
  color:white;
  padding:10px;

  &:hover {
    background-color:blue;
  }
`;

const StyledButton = styled.button`
  background-color:aqua;
  color:white;
  padding:10px;

  &:hover {
    background-color:blue;
  }
`;

const EmoButton = styled.button`
  ${EmotionButton}  
`;

function App() {
  return (
    <div>
      <h1>[BUTTON]</h1>
      <Button/><br></br>
      <StyledButton>StyledButton</StyledButton><br></br>
      <EmoButton>EmoButton</EmoButton>
    </div>
  );
}

export default App;
