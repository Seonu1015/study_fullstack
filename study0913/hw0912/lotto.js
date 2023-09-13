import React, { createContext, useContext, useState } from 'react';

const LottoContext = createContext();

function LottoProvider({ children }) {
    const [lottoManual, setLottoManual] = useState([]);
    const [lottoAuto, setLottoAuto] = useState([]);
    const [mode, setMode] = useState('auto');

    const generateRandomNumbers = () => {
        const randomNumbers = [];
        for (var i = 0; i < randomNumbers.length; i++) {
            const newNumber = Math.floor(Math.random() * 45) + 1;
            if (randomNumbers[i] === newNumber) {
                return i - 1
            }
            randomNumbers = [...randomNumbers, newNumber];
        }
        setLottoAuto(randomNumbers);
    }

    const handleModeChange = (event) => {
        setLottoAuto(event.target.value);
    }

    return (
        <LottoContext.Provider value={{ lottoAuto, generateRandomNumbers }}>
            {children}
        </LottoContext.Provider>
    );
}

function SelectAutoOrManual() {
    const { mode, generateRandomNumbers, handleModeChange } = useContext(LottoContext);

    return (
        <div>
            <label>
                <input type="radio" name='lotto' value='auto' /> 자동
            </label>
            <label>
                <input type="radio" name='lotto' value='manual' checked /> 수동
            </label>

            {mode === 'auto' && <button onClick={generateRandomNumbers}>번호 생성</button>}
        </div>
    );
}

function OutputLotto() {

}

function Lotto() {
    return (
        <LottoProvider>
            <SelectAutoOrManual/>
        </LottoProvider>
    );
}

export default Lotto;