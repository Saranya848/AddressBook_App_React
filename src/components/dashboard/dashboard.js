import React, {useEffect, useState} from "react";
import './dashboard.css';
import logo from '../../assets/images/logo.jpeg';
import {Link} from "react-router-dom";
import AddressbookService from "../../service/addressbook-service";
import Contact from "./contacts";


function Dashboard() {

    const [contactArray, setContact] = useState([]);

    useEffect(() => {
        getAllContacts();
    }, []);

    const getAllContacts = () => {
        AddressbookService.getContacts().then((response) => {
            const allContacts = response.data;
            setContact(allContacts);
        }).catch((error) => {
            alert(error);
        })
    }

    return (
        <>
            <header className="header-content header">
                <div className="logo-content">
                    <img src={logo} alt="logo"/>
                    <div>
                        <span className="addressBook-text">Address</span><br/>
                        <span className="addressBook-text addressBook-book">Book</span>
                    </div>
                </div>
            </header>
            <div className="main-content">
                <div className="header-content person-header">
                    <div className="person-detail-text">
                        Person Details
                        <div className="person-count">{contactArray.length}</div>
                    </div>
                    <Link to="/form" className="add-button">
                        <div>Add Person</div>
                    </Link>
                </div>
                <div className="table-main">
                    {/*<table id="table-display" className="table">*/}
                    {/*    <tr>*/}
                    {/*        <th>Full Name</th>*/}
                    {/*        <th>Address</th>*/}
                    {/*        <th>City</th>*/}
                    {/*        <th>State</th>*/}
                    {/*        <th>Zip Code</th>*/}
                    {/*        <th>Phone Number</th>*/}
                    {/*        <th>Actions</th>*/}
                    {/*    </tr>*/}
                    {/*    <tr>*/}
                    {/*        <td>Sreenath</td>*/}
                    {/*        <td>Hanuman Nagar, Adoni</td>*/}
                    {/*        <td>Kurnool</td>*/}
                    {/*        <td>Andhra Pradesh</td>*/}
                    {/*        <td>518301</td>*/}
                    {/*        <td>91 7075321456</td>*/}
                    {/*        <td>*/}
                    {/*            <img src={deleteLogo} alt="delete" id="1" onClick="remove(this)"/>*/}
                    {/*            <img src={editLogo} alt="edit" id="1" onClick="update(this)"/>*/}
                    {/*        </td>*/}
                    {/*    </tr>*/}
                    {/*</table>*/}
                    <Contact contactArray={contactArray}/>
                </div>
            </div>
        </>
    );
}
export default Dashboard;