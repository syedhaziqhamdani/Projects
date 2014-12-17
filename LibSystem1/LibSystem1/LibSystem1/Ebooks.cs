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
    public partial class Ebooks : Form
    {

        SqlDataAdapter adpt;
        DataSet ds;

        public Ebooks()
        {
            InitializeComponent();
        }

        private void Ebooks_Load(object sender, EventArgs e)
        {

            try
            {

                SqlConnection conn = new SqlConnection();
                conn.ConnectionString = "Data Source=PC\\SQLExpress;Initial Catalog=LIBRARYMANAGEMENTSYSTEM;Integrated Security=True";

                
                adpt = new SqlDataAdapter("select * from BOOKS", conn);

                ds = new DataSet();
                adpt.Fill(ds, "BOOKS");

                dataGridView1.DataSource = ds.Tables[0];
            }
            catch (Exception ex)
            {


            }

        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            try
            {

                SqlCommandBuilder cmdb = new SqlCommandBuilder(adpt);

                adpt.Update(ds, "BOOKS");

            }
            catch (Exception ex)
            {



            }
        }
    }
}
