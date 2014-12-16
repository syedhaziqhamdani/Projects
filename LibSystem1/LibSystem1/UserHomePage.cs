using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LibSystem1
{
    public partial class UserHomePage : Form
    {
        SqlConnection conn;
        SqlDataAdapter adpt;
        DataSet ds;
        DataSet dsbutton;

        public UserHomePage()
        {
            InitializeComponent();
        }

        

        private void UserHomePage_Load(object sender, EventArgs e)
        {
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = "Data Source=PC\\SQLExpress;Initial Catalog=LIBRARYMANAGEMENTSYSTEM;Integrated Security=True";
            try
            {
              
                adpt = new SqlDataAdapter("select ISBN,NAME,ISSUESTATUS from BOOKS", conn);

                ds = new DataSet();
                adpt.Fill(ds, "BOOKS");

                dataGridView1.DataSource = ds.Tables[0];
            }
            catch (Exception ex)
            {


            }
        }

        private void btnsearch_Click(object sender, EventArgs e)
        {
            adpt = new SqlDataAdapter("select ISBN,NAME,ISSUESTATUS from BOOKS where NAME like '%" + txtsearch.Text + "%'", "Data Source=PC\\SQLExpress;Initial Catalog=LIBRARYMANAGEMENTSYSTEM;Integrated Security=True");

            dsbutton = new DataSet();
            adpt.Fill(dsbutton, "BOOKS");

            dataGridView1.DataSource = dsbutton.Tables[0];
        }
    }
}
