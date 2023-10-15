import React, { useState } from "react";

const Page = ({ data }) => {
    const items = data;

    // items 안에 있는걸 리스트로 뽑기 때문에 한 화면에 나옴
    // items 를 찢어버려 -> 어떻게?
    return (
      <ul>
        {items.map((item) => (
          <li key={item.id}>{item.text}</li>
        ))}
      </ul>
    );
};

const Turnpage = () => {
    const [currentPage, setCurrentPage] = useState(1);

    const data = [
        { id: 1, text: 'Hu' },
        { id: 2, text: 'He' },
        { id: 3, text: 'Ho' },
      ];
    

    const prevPage = () => {
        if (currentPage > 1) {
            setCurrentPage(currentPage - 1);
        }
    }

    const nextPage = () => {
        if (currentPage < 3) {
            setCurrentPage(currentPage + 1);
        }
    }

    return (
        <div>
            <Page data={data}/>
            <button onClick={prevPage}>이전 페이지</button>
            <button onClick={nextPage}>다음 페이지</button>
        </div>
    );
}

export default Turnpage;