import React, {createContext, useContext, useState} from 'react';

const LanguageContext = createContext();

function LanguageProvider({children}) {
    const [lang, setLang] = useState('en');

    const switchLang = () => {
        setLang(prevLang => prevLang === 'en' ? 'ko' : 'en');
    } // 버튼 같은 게 있으면 en <-> ko 바꿀 수 있게 하려고 넣은 것

    const handleChange = (event) => {
        setLang(event.target.value);
    }

    return (
        <LanguageContext.Provider value={{lang, switchLang, handleChange}}>
            {children}
        </LanguageContext.Provider>
    );
}

function SelectLang() {
    const {lang, handleChange} = useContext(LanguageContext);

    return (
        <select onChange={handleChange}>
            <option value="en">English</option>
            <option value="ko">Korean</option>
        </select>
    );
}

function SayHello() {
    const {lang} = useContext(LanguageContext);

    return <p>{lang === 'en' ? 'Hello!' : '안녕!'}</p>;
}

function Language() {
    return (
        <LanguageProvider>
            <SelectLang/>
            <SayHello/>
        </LanguageProvider>
    );
}

export default Language;