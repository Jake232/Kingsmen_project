import React, { Component } from 'react';
import './App.css';
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";

class App extends Component {  
  render(){
    //Dummy data for now
    const data = [
      {
        name: 'Test',
        cost: 99,
        stocked: false
      },
      {
        name: 'asdf',
        cost: 1,
        stocked: true
      }
    ]
    const columns = [
    {
      Header: 'Name',  
      accessor: 'name'  
    },
    {  
      Header: 'Price',  
      accessor: 'cost'  
    },
    {
      Header: 'In Stock',
      id: 'stocked',
      accessor: (row) => { return row['stocked'].toString() === 'true' ? 'Yes' : 'No' }
    }]

    return (  
      <div>  
        <ReactTable  
          data={data}  
          columns={columns}  
          defaultPageSize = {2}  
          pageSizeOptions = {[2,4, 6]}  
        />  
      </div>        
    )  
  }  
}  
export default App;  