import axios from "axios";

const client = axios.create();

client.defaults.baseURL =
    "http://localhost:7150";

export default client;