import axios from "axios";
import { Route, Routes, useNavigate } from "react-router-dom";
import {useEffect, useState} from "react";
import GlobalStyle from "./style/GlobalStyle";
import NavbarContainer from "./containers/common/NavbarContainer";

function App() {
    const [hello, setHello] = useState('')

    // useEffect(() => {
    //     const response = axios.get('/api/hello')
    //         .then(response => setHello(response.data))
    //         .catch(error => console.log(error));
    //     console.log(response.data)
    // }, []);
    // console.log(hello);
    return (
      <div>
          <NavbarContainer />
          <GlobalStyle />
          <Routes>
            <Route path="/" />
          </Routes>
        백엔드에서 가져온 데이터입니다 : {hello}
      </div>
    );
}

export default App;
