import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import './ChampionGrid.css'

function ChampDetail() {
    const {id} = useParams();
    const [champion, setChampion] = useState(null);

    useEffect(() => {
        fetch(`http://ddragon.leagueoflegends.com/cdn/13.18.1/data/ko_KR/champion/${id}.json`)
        .then(response => response.json())
        .then(data => setChampion(data.data[id]));
    }, [id]);

    if (!champion) {
        return <div>Loading...</div>
    }

    return (
        <>
            <div>
                <hr/>
                <div className="details-top">
                    <img src={`http://ddragon.leagueoflegends.com/cdn/img/champion/loading/${champion.id}_0.jpg`}
                        alt="{champion.name}" style={{width:'150px', height:'auto', marginLeft:'15px'}}/>
                    <span style={{marginRight:'20px'}}>
                        <p style={{fontSize: '40px', margin:'10px'}}>{champion.name} ({champion.title})</p>
                        <p style={{backgroundColor:'brown', color:'white'}}>{champion.tags.join(", ")}</p>
                        <p>{champion.lore}</p>                        
                        <p>{champion.blurb}</p>
                    </span>
                </div>
                <hr/>
                <div>
                    <p><h4 style={{fontStyle:'bold'}}>allytips</h4>{champion.allytips.join(' ')}</p>                        
                    <p><h4 style={{fontStyle:'bold'}}>enemytips</h4>{champion.enemytips.join(' ')}</p>
                </div>
                <hr/>
                <div>
                    
                </div>
            </div>
        </>
    );
}

export default ChampDetail;